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
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

//when cart is created for multi site TRU and response we hit for TRU
GlobalVariable.tempbrand = 'TRU'

// WebUI.callTestCase(findTestCase('CreateCart'), [:], FailureHandling.STOP_ON_FAILURE)
authResponse = WS.sendRequest(findTestObject('Postman/Postman/AuthService-Valid Header'))

println(authResponse.getResponseBodyContent())

assert WS.getResponseStatusCode(authResponse) == 200

String cartId = WS.getElementText(authResponse, 'result.cartId')

if (cartId.equalsIgnoreCase(GlobalVariable.truCartId)) {
    KeywordUtil.markPassed('Authorized')
} else {
    KeywordUtil.markFailed('Failed to Authorize')
}

