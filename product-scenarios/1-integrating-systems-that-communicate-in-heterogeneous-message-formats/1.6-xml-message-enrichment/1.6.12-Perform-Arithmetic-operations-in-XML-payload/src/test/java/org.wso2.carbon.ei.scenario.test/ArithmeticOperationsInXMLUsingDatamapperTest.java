/*
 * Copyright (c) 2019, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
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

package org.wso2.carbon.ei.scenario.test;

import org.apache.axis2.transport.http.HTTPConstants;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.wso2.carbon.esb.scenario.test.common.ScenarioTestBase;
import org.wso2.carbon.esb.scenario.test.common.http.HTTPUtils;

import java.io.IOException;
import javax.xml.stream.XMLStreamException;

public class ArithmeticOperationsInXMLUsingDatamapperTest extends ScenarioTestBase {

    @BeforeClass
    public void init() throws Exception {
        super.init();
    }

    /**
     * This test is to verify if add operation can be performed with given xml payload using
     *  datamapper mediator.
     */
    @Test(description = "1.6.12.1")
    public void performAddOperationUsingDatamapper() throws IOException, XMLStreamException {
        String apiName = "1_6_12_1_API_performAddOperationUsingDatamapper";
        String testCaseId = "1.6.12.1";
        String apiInvocationUrl = getApiInvocationURLHttp(apiName);

        String request =
                "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n"
                        + "<AddNumbers>\n"
                        + "    <num1>51</num1>\n"
                        + "    <num2>6</num2>\n"
                        + "</AddNumbers>";

        String expectedResponse =
                "<ResultAdd>\n"
                        + "    <result>57.0</result>\n"
                        + "</ResultAdd>";

        HTTPUtils.invokePoxEndpointAndAssert(apiInvocationUrl,request, HTTPConstants.MEDIA_TYPE_APPLICATION_XML,
                testCaseId, expectedResponse, 200, "performAddOperationUsingDatamapper");

    }

    /**
     * This test is to verify if substract operation can be performed with given xml payload using
     *  datamapper mediator.
     */
    @Test(description = "1.6.12.2")
    public void performSubstractOperationUsingDatamapper() throws IOException, XMLStreamException {
        String apiName = "1_6_12_2_API_performSubstractOperationUsingDatamapper";
        String testCaseId = "1.6.12.2";
        String apiInvocationUrl = getApiInvocationURLHttp(apiName);

        String request =
                "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n"
                        + "<SubstractNumbers>\n"
                        + "    <num1>51</num1>\n"
                        + "    <num2>6</num2>\n"
                        + "</SubstractNumbers>";

        String expectedResponse =
                "<ResultSubstract>\n"
                        + "    <result>45.0</result>\n"
                        + "</ResultSubstract>";

        HTTPUtils.invokePoxEndpointAndAssert(apiInvocationUrl,request, HTTPConstants.MEDIA_TYPE_APPLICATION_XML,
                testCaseId, expectedResponse, 200, "performSubstractOperationUsingDatamapper");

    }

    /**
     * This test is to verify if multiplication operation can be performed with given xml payload using
     *  datamapper mediator.
     */
    @Test(description = "1.6.12.3")
    public void performMultiplicationOperationUsingDatamapper() throws IOException, XMLStreamException {
        String apiName = "1_6_12_3_API_performMultiplicationOperationUsingDatamapper";
        String testCaseId = "1.6.12.3";
        String apiInvocationUrl = getApiInvocationURLHttp(apiName);

        String request =
                "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n"
                        + "<MultiplyNumbers>\n"
                        + "    <num1>5</num1>\n"
                        + "    <num2>6</num2>\n"
                        + "</MultiplyNumbers>";

        String expectedResponse =
                "<ResultMultiply>\n"
                        + "    <result>30.0</result>\n"
                        + "</ResultMultiply>";

        HTTPUtils.invokePoxEndpointAndAssert(apiInvocationUrl,request, HTTPConstants.MEDIA_TYPE_APPLICATION_XML,
                testCaseId, expectedResponse, 200, "performMultiplicationOperationUsingDatamapper");

    }

    /**
     * This test is to verify if division operation can be performed with given xml payload using
     *  datamapper mediator.
     */
    @Test(description = "1.6.12.4")
    public void performDivisionOperationUsingDatamapper() throws IOException, XMLStreamException {
        String apiName = "1_6_12_4_API_performDivisionOperationUsingDatamapper";
        String testCaseId = "1.6.12.4";
        String apiInvocationUrl = getApiInvocationURLHttp(apiName);

        String request =
                "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n"
                        + "<DivideNumbers>\n"
                        + "    <num1>10</num1>\n"
                        + "    <num2>5</num2>\n"
                        + "</DivideNumbers>";

        String expectedResponse =
                "<ResultDivide>\n"
                        + "    <result>2.0</result>\n"
                        + "</ResultDivide>";

        HTTPUtils.invokePoxEndpointAndAssert(apiInvocationUrl,request, HTTPConstants.MEDIA_TYPE_APPLICATION_XML,
                testCaseId, expectedResponse, 200, "performDivisionOperationUsingDatamapper");

    }

    /**
     * This test is to verify if it can get the round value with given xml payload using
     *  datamapper mediator.
     */
    @Test(description = "1.6.12.5")
    public void getRoundValueUsingDatamapper() throws IOException, XMLStreamException {
        String apiName = "1_6_12_5_API_getRoundValueUsingDatamapper";
        String testCaseId = "1.6.12.5";
        String apiInvocationUrl = getApiInvocationURLHttp(apiName);

        String request =
                "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n"
                        + "<RoundValue>\n"
                        + "    <num1>1.56</num1>\n"
                        + "</RoundValue>";

        String expectedResponse =
                "<ResultRoundValue>\n"
                        + "    <result>2.0</result>\n"
                        + "</ResultRoundValue>";

        HTTPUtils.invokePoxEndpointAndAssert(apiInvocationUrl,request, HTTPConstants.MEDIA_TYPE_APPLICATION_XML,
                testCaseId, expectedResponse, 200, "getRoundValueUsingDatamapper");

    }

    /**
     * This test is to verify if it can get the ceiling value with given xml payload using
     *  datamapper mediator.
     */
    @Test(description = "1.6.12.6")
    public void getCeilingValueUsingDatamapper() throws IOException, XMLStreamException {
        String apiName = "1_6_12_6_API_getCeilingValueUsingDatamapper";
        String testCaseId = "1.6.12.6";
        String apiInvocationUrl = getApiInvocationURLHttp(apiName);

        String request =
                "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n"
                        + "<CeilingValue>\n"
                        + "    <num1>1.1</num1>\n"
                        + "</CeilingValue>";

        String expectedResponse =
                "<ResultCeilingValue>\n"
                        + "    <result>2.0</result>\n"
                        + "</ResultCeilingValue>";

        HTTPUtils.invokePoxEndpointAndAssert(apiInvocationUrl,request, HTTPConstants.MEDIA_TYPE_APPLICATION_XML,
                testCaseId, expectedResponse, 200, "getCeilingValueUsingDatamapper");

    }

    /**
     * This test is to verify if it can get the absolute value with given xml payload using
     *  datamapper mediator.
     */
    @Test(description = "1.6.12.7")
    public void getAbsoluteValueUsingDatamapper() throws IOException, XMLStreamException {
        String apiName = "1_6_12_7_API_getAbsoluteValueUsingDatamapper";
        String testCaseId = "1.6.12.7";
        String apiInvocationUrl = getApiInvocationURLHttp(apiName);

        String request =
                "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n"
                        + "<AbsoluteValue>\n"
                        + "    <num1>-7</num1>\n"
                        + "</AbsoluteValue>";

        String expectedResponse =
                "<ResultAbsoluteValue>\n"
                        + "    <result>7.0</result>\n"
                        + "</ResultAbsoluteValue>";

        HTTPUtils.invokePoxEndpointAndAssert(apiInvocationUrl,request, HTTPConstants.MEDIA_TYPE_APPLICATION_XML,
                testCaseId, expectedResponse, 200, "getAbsoluteValueUsingDatamapper");

    }

    @AfterClass(description = "Server Cleanup", alwaysRun = true)
    public void cleanup() throws Exception {
        super.cleanup();
    }
}
