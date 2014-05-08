/**
 * 
 * Copyright (c) Microsoft and contributors.  All rights reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * 
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 */

// Warning: This code was generated by a tool.
// 
// Changes to this file may cause incorrect behavior and will be lost if the
// code is regenerated.

package com.microsoft.windowsazure.management.sql.models;

/**
* Parameters supplied to the Create Database operation.
*/
public class DatabaseCreateParameters {
    private String collationName;
    
    /**
    * Optional. Gets or sets the collation name for the new database.
    * @return The CollationName value.
    */
    public String getCollationName() {
        return this.collationName;
    }
    
    /**
    * Optional. Gets or sets the collation name for the new database.
    * @param collationNameValue The CollationName value.
    */
    public void setCollationName(final String collationNameValue) {
        this.collationName = collationNameValue;
    }
    
    private String edition;
    
    /**
    * Required. Gets or sets the edition for the new database.
    * @return The Edition value.
    */
    public String getEdition() {
        return this.edition;
    }
    
    /**
    * Required. Gets or sets the edition for the new database.
    * @param editionValue The Edition value.
    */
    public void setEdition(final String editionValue) {
        this.edition = editionValue;
    }
    
    private int maximumDatabaseSizeInGB;
    
    /**
    * Required. Gets or sets the maximum size of this database, in Gigabytes.
    * @return The MaximumDatabaseSizeInGB value.
    */
    public int getMaximumDatabaseSizeInGB() {
        return this.maximumDatabaseSizeInGB;
    }
    
    /**
    * Required. Gets or sets the maximum size of this database, in Gigabytes.
    * @param maximumDatabaseSizeInGBValue The MaximumDatabaseSizeInGB value.
    */
    public void setMaximumDatabaseSizeInGB(final int maximumDatabaseSizeInGBValue) {
        this.maximumDatabaseSizeInGB = maximumDatabaseSizeInGBValue;
    }
    
    private String name;
    
    /**
    * Required. Gets or sets the name for the new database.
    * @return The Name value.
    */
    public String getName() {
        return this.name;
    }
    
    /**
    * Required. Gets or sets the name for the new database.
    * @param nameValue The Name value.
    */
    public void setName(final String nameValue) {
        this.name = nameValue;
    }
    
    private String serviceObjectiveId;
    
    /**
    * Optional. Gets or sets the id of this service objective.
    * @return The ServiceObjectiveId value.
    */
    public String getServiceObjectiveId() {
        return this.serviceObjectiveId;
    }
    
    /**
    * Optional. Gets or sets the id of this service objective.
    * @param serviceObjectiveIdValue The ServiceObjectiveId value.
    */
    public void setServiceObjectiveId(final String serviceObjectiveIdValue) {
        this.serviceObjectiveId = serviceObjectiveIdValue;
    }
}