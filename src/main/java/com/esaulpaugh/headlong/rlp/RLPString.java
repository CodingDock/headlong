/*
   Copyright 2019 Evan Saulpaugh

   Licensed under the Apache License, Version 2.0 (the "License");
   you may not use this file except in compliance with the License.
   You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.
*/
package com.esaulpaugh.headlong.rlp;

import com.esaulpaugh.headlong.rlp.exception.DecodeException;

/**
 * Created by Evo on 1/19/2017.
 */
public final class RLPString extends RLPItem {

    RLPString(byte lead, DataType type, byte[] buffer, int index, int containerEnd, boolean lenient) throws DecodeException {
        super(lead, type, buffer, index, containerEnd, lenient);
    }

    @Override
    public boolean isList() {
        return false;
    }
    
    @Override
    public RLPString duplicate(RLPDecoder decoder) throws DecodeException {
        return decoder.wrapString(encoding(), 0);
    }
}
