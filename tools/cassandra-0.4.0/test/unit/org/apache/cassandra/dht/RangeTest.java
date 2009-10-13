/*
* Licensed to the Apache Software Foundation (ASF) under one
* or more contributor license agreements.  See the NOTICE file
* distributed with this work for additional information
* regarding copyright ownership.  The ASF licenses this file
* to you under the Apache License, Version 2.0 (the
* "License"); you may not use this file except in compliance
* with the License.  You may obtain a copy of the License at
*
*    http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing,
* software distributed under the License is distributed on an
* "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
* KIND, either express or implied.  See the License for the
* specific language governing permissions and limitations
* under the License.
*/
package org.apache.cassandra.dht;

import org.junit.Test;

public class RangeTest {
    @Test
    public void testRange() {
        Range left = new Range(new BigIntegerToken("0"), new BigIntegerToken("100"));
		assert left.contains(new BigIntegerToken("0"));
        assert left.contains(new BigIntegerToken("10"));
        assert !left.contains(new BigIntegerToken("-1"));
        assert !left.contains(new BigIntegerToken("100"));
        assert !left.contains(new BigIntegerToken("101"));

        Range right = new Range(new BigIntegerToken("100"), new BigIntegerToken("0"));
        assert right.contains(new BigIntegerToken("100"));
        assert right.contains(new BigIntegerToken("200"));
        assert right.contains(new BigIntegerToken("-10"));
        assert !right.contains(new BigIntegerToken("0"));
        assert !right.contains(new BigIntegerToken("1"));
    }
}
