/*
 * Copyright 2014 ptma@163.com
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.xqsight.generator.db;

import java.sql.Connection;
import java.sql.SQLException;

import com.xqsight.generator.config.TypeMapping;
import com.xqsight.generator.db.model.Table;

public class MySqlDatabase extends DefaultDatabase {

    private static final String TABLE_COMMENTS_SQL  = "show table status where NAME=?";

    public MySqlDatabase(Connection connection, TypeMapping typeMapping){
        super(connection, typeMapping);
    }

    @Override
    public Table getTable(String catalog, String schema, String tableName) throws SQLException {
        Table table = super.getTable(catalog, schema, tableName);
        if (table != null) {
            introspectTableComments(table, TABLE_COMMENTS_SQL, "COMMENT");
        }
        return table;
    }

}
