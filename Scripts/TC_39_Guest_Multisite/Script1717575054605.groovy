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
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil


GlobalVariable.tempbrand = (GlobalVariable.brand[0])

println(GlobalVariable.tempbrand)

AnonycartResponse = WS.sendRequest(findTestObject('Postman/Postman/CreateAnonyCart'))

AnononymousCartId = WS.getElementPropertyValue(AnonycartResponse, 'id')

GlobalVariable.anony_cartid = AnononymousCartId

println(GlobalVariable.anony_cartid)

GlobalVariable.AAT=""

GlobalVariable.tempbrand = (GlobalVariable.brand[2])

GuestAuthResponse = WS.sendRequest(findTestObject('Postman/Postman/AuthService-Valid Header', [('AAT') : GlobalVariable.AAT
            , ('host') : GlobalVariable.host]))

WS.verifyResponseStatusCode(GuestAuthResponse, 200, FailureHandling.STOP_ON_FAILURE)

ResponseCartid=WS.getElementPropertyValue(GuestAuthResponse, 'result.anonymousCartId')
println(ResponseCartid)

if (GlobalVariable.anony_cartid != ResponseCartid || ResponseCartid =="null")
{
	println("Cartid is getting displayed for the respective brand")
}
else {
	KeywordUtil.markFailed("Testcase Failed")
}
		  	 
GlobalVariable.anony_cartid="9912a6cf-3166-440d-9ebc-dd4bcaa45039"


