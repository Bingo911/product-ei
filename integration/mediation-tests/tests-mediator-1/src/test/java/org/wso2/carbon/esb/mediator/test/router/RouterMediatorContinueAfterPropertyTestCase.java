/*
 * Copyright (c) 2005-2010, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 * 
 * WSO2 Inc. licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License.
 * You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.wso2.carbon.esb.mediator.test.router;

import org.apache.axiom.om.OMElement;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.wso2.esb.integration.common.utils.ESBIntegrationTest;

/**
 * Tests continue after property of the router mediator
 */

public class RouterMediatorContinueAfterPropertyTestCase extends ESBIntegrationTest {

    @BeforeClass
    public void setEnvironment() throws Exception {
        init();
    }

    @Test(groups = "wso2.esb",
          description = "Tests with continueAfter=true")
    public void testContinueAfterTrue() throws Exception {
        verifyProxyServiceExistence("routerContinueAfterTrueTestProxy");
        OMElement response = axis2Client
                .sendSimpleStockQuoteRequest(getProxyServiceURLHttp("routerContinueAfterTrueTestProxy"), null, "WSO2");
        Assert.assertTrue(response.toString().contains("WSO2"));
    }

    @Test(groups = "wso2.esb",
          description = "Tests with continueAfter=false")
    public void testContinueAfterFalse() throws Exception {
        verifyProxyServiceExistence("routerContinueAfterFalseTestProxy");
        OMElement response = null;
        try {
            response = axis2Client
                    .sendSimpleStockQuoteRequest(getProxyServiceURLHttp("routerContinueAfterFalseTestProxy"), null,
                            "WSO2");
        } catch (Exception e) {

        }

        Assert.assertTrue(response == null, "Response should be null");
    }

    @AfterClass
    public void close() throws Exception {
        super.cleanup();
    }

}
