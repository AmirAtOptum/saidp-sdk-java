package org.secureauth.sarestapi.util;


import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.secureauth.sarestapi.data.*;

import java.io.IOException;

/**
 * @author rrowcliffe@secureauth.com
 *
Copyright (c) 2015, SecureAuth
All rights reserved.

Redistribution and use in source and binary forms, with or without modification, are permitted provided that the following conditions are met:

1. Redistributions of source code must retain the above copyright notice, this list of conditions and the following disclaimer.

2. Redistributions in binary form must reproduce the above copyright notice, this list of conditions and the following disclaimer in the documentation and/or other materials provided with the distribution.

3. Neither the name of the copyright holder nor the names of its contributors may be used to endorse or promote products derived from this software without specific prior written permission.

THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED.
IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS;
OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */


public class JSONUtil {
    public JSONUtil (){}

    public static String getJSONStringFromObject(AuthRequest authRequest){
        ObjectMapper mapper = new ObjectMapper();
        StringBuilder stringBuilder = new StringBuilder();

        try{

            stringBuilder.append(mapper.writeValueAsString(authRequest));

        }catch (JsonGenerationException e) {

            e.printStackTrace();

        } catch (JsonMappingException e) {

            e.printStackTrace();

        }catch (IOException e) {

            e.printStackTrace();

        }

        return stringBuilder.toString();
    }

    public static String getJSONStringFromObject(IPEvalRequest ipEvalRequest){
        ObjectMapper mapper = new ObjectMapper();
        StringBuilder stringBuilder = new StringBuilder();

        try{

            stringBuilder.append(mapper.writeValueAsString(ipEvalRequest));

        }catch (JsonGenerationException e) {

            e.printStackTrace();

        } catch (JsonMappingException e) {

            e.printStackTrace();

        }catch (IOException e) {

            e.printStackTrace();

        }

        return stringBuilder.toString();
    }

    public static String getJSONStringFromObject(AccessHistoryRequest accessHistoryRequest){
        ObjectMapper mapper = new ObjectMapper();
        StringBuilder stringBuilder = new StringBuilder();

        try{

            stringBuilder.append(mapper.writeValueAsString(accessHistoryRequest));

        }catch (JsonGenerationException e) {

            e.printStackTrace();

        } catch (JsonMappingException e) {

            e.printStackTrace();

        }catch (IOException e) {

            e.printStackTrace();

        }

        return stringBuilder.toString();
    }

    public static String getJSONStringFromObject(DFPValidateRequest dfpValidateRequest){
        ObjectMapper mapper = new ObjectMapper();
        StringBuilder stringBuilder = new StringBuilder();

        try{

            stringBuilder.append(mapper.writeValueAsString(dfpValidateRequest));

        }catch (JsonGenerationException e) {

            e.printStackTrace();

        } catch (JsonMappingException e) {

            e.printStackTrace();

        }catch (IOException e) {

            e.printStackTrace();

        }

        return stringBuilder.toString();
    }

    public static String getJSONStringFromObject(DFPConfirmRequest dfpConfirmRequest){
        ObjectMapper mapper = new ObjectMapper();
        StringBuilder stringBuilder = new StringBuilder();

        try{

            stringBuilder.append(mapper.writeValueAsString(dfpConfirmRequest));

        }catch (JsonGenerationException e) {

            e.printStackTrace();

        } catch (JsonMappingException e) {

            e.printStackTrace();

        }catch (IOException e) {

            e.printStackTrace();

        }

        return stringBuilder.toString();
    }

    public static DFP getObjectFromJSONString(String dfpJsonString){
        ObjectMapper mapper = new ObjectMapper();
        StringBuilder stringBuilder = new StringBuilder();
        DFP dfp = new DFP();

        try{
            dfp = mapper.readValue(dfpJsonString,DFP.class);


        }catch (JsonGenerationException e) {

            e.printStackTrace();

        } catch (JsonMappingException e) {

            e.printStackTrace();

        }catch (IOException e) {

            e.printStackTrace();

        }

        return dfp;
    }
}
