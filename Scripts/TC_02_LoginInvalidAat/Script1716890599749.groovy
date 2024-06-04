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

GlobalVariable.AAT = 'gfcvnbbnbh-vghv'
GlobalVariable.tempdeviceId = '02-128254519'

GlobalVariable.tempbrand = 'LP'

GlobalVariable.tempchannel = 'web'

GlobalVariable.tempCid ='0d8b1074-6f95-4366-b1cd-f90abb8a9557'

accessRes = WS.sendRequest(findTestObject('Postman/Postman/Auth'))

if (WS.getResponseStatusCode(accessRes) == 400) {
    println('validation happening properly for invalid accesstoken in the header')
} else {
    KeywordUtil.markFailed('Validation is not happening correctly when passing invalid access token in the header')
    
    println(accessRes.getResponseBodyContent())
}

