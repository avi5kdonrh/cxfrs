/**
 *  Copyright 2005-2016 Red Hat, Inc.
 *
 *  Red Hat licenses this file to you under the Apache License, version
 *  2.0 (the "License"); you may not use this file except in compliance
 *  with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or
 *  implied.  See the License for the specific language governing
 *  permissions and limitations under the License.
 */
package org.example;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

import org.apache.camel.component.cxf.CxfPayload;
import org.springframework.stereotype.Service;
 
@Path("/sayHello")
@Service
public class HelloService {
 
    @GET
    @Path("")
    @Produces(MediaType.TEXT_PLAIN)
    public String welcome(){return null;}
    
    @GET
    @Path("/test/{a}")
    @Produces(MediaType.TEXT_PLAIN)
    public String sayHello(@PathParam("a") String a){return null;}

    @POST
    @Path("/set")
    @Produces(MediaType.TEXT_PLAIN)
    @Consumes(MediaType.APPLICATION_JSON)
    public String set(TestClass input){return null;}
}
