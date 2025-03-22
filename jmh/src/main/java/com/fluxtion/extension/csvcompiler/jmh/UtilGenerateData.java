/*
 *
 * Copyright 2022-2022 greg higgins
 *
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */

package com.fluxtion.extension.csvcompiler.jmh;

import com.fluxtion.extension.csvcompiler.RowMarshaller;
import com.fluxtion.extension.csvcompiler.jmh.beans.DataWithNames;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class UtilGenerateData {

    public static void main(String[] args) throws IOException {

        FileWriter writer = new FileWriter("./src/main/data/canada10Columns.txt");
        RowMarshaller<DataWithNames> marshaller = RowMarshaller.load(DataWithNames.class);
//        marshaller.writeHeaders(writer);
        Random random = new Random();
        DataWithNames data = new DataWithNames();
        for (int i = 0; i < 100_000; i++) {
            data.setAge((int)random.nextDouble());
            data.setName1("sample name1");
            data.setName2("sample name2");
            data.setName3("sample name3");
            data.setName4("sample name4");
            data.setName5("sample name5");
            data.setName6("sample name6");
            data.setName7("sample name7");
            data.setName8("sample name8");
            data.setName9("sample name9");
            marshaller.writeRow(data, writer);
        }
        writer.close();
    }

}
