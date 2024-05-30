import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import org.openqa.selenium.remote.server.handler.GetElementText as Keys

accessRes = WS.sendRequest(findTestObject('Postman/Postman/Auth'))

assert WS.getResponseStatusCode(accessRes) == 200

GlobalVariable.custId = WS.getElementText(accessRes, 'result.customerId')

GlobalVariable.cartId = WS.getElementText(accessRes, 'result.cartId')

GlobalVariable.custKey = WS.getElementText(accessRes, 'result.customerKey')

GlobalVariable.devId = WS.getElementText(accessRes, 'result.deviceId')

Boolean result = (((GlobalVariable.custId.length() != 0) && (GlobalVariable.cartId == 'null')) && (GlobalVariable.devId.length() != 
0)) && (GlobalVariable.custKey.length() != 0)

if (result) {
    println('Validated successfully')

    //println('customerid  '+ GlobalVariable.custId)
    println('cartid  ' + GlobalVariable.cartId)

    //println('deviceid  '+ GlobalVariable.custKey)
    //println('customerkey  '+ GlobalVariable.devId)
    println(accessRes.getResponseBodyContent())
} else {
    println('Failed to validate as the cart Id is not null , cart Id = ' +GlobalVariable.cartId )
}
