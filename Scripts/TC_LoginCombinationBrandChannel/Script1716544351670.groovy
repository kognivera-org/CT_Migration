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

			//setting the header variables
GlobalVariable.tempCid = "0d8b1074-6f95-4366-b1cd-f90abb8a9557"

GlobalVariable.tempAat = "ZXlKaGJHY2lPaUpTVXpJMU5pSXNJblI1Y0NJNklrcFhWQ0lzSW10cFpDSTZJakJHVFc5QlVrNHhRa05aVWw4eVFXZ3daa1JUZUNKOS5leUpvZEhSd2N6b3ZMMnhwZG1WeWNHOXZiQzVqYjIwdWJYZ3ZjSEp1SWpvaU1qSTROVGsxTXpjeE1pSXNJbWgwZEhCek9pOHZiR2wyWlhKd2IyOXNMbU52YlM1dGVDOXBjMU5wWjI1VmNDSTZabUZzYzJVc0ltbHpjeUk2SW1oMGRIQnpPaTh2Ykc5bmFXNHRjV0V5TG14cGRtVnljRzl2YkM1amIyMHViWGd2SWl3aWMzVmlJam9pWVhWMGFEQjhOalJoTW1JME9EZzFZVGMxTWpNeVptRXhaakU0Wm1ReElpd2lZWFZrSWpwYkltaDBkSEJ6T2k4dllYVjBhREF1YkdsMlpYSndiMjlzTG1OdmJTNXRlQ0lzSW1oMGRIQnpPaTh2YkdsMlpYSndiMjlzTFhGaE1pNTFjeTVoZFhSb01DNWpiMjB2ZFhObGNtbHVabThpWFN3aWFXRjBJam94TnpFMk1UZzFOVGsxTENKbGVIQWlPakUzTVRZeU56RTVPVFVzSW5OamIzQmxJam9pYjNCbGJtbGtJSEJ5YjJacGJHVWdaVzFoYVd3aUxDSmhlbkFpT2lKV1FrazFhR3BGTTNKMVNqbDRkVU5IV1dGdE9GbzVUMDEzUmpCbE5XdDZiU0o5LlhJZXJUV2p3N1ROT1hHNWY2TG1RcURQTFc1LVRKZ01BS2I3VUhxNmZNOVphdG0zVjJ4Rjd0cVB0Q1ROdlh4aldSSUhxRVRMY21QOXdCb1hKZ1l1QlRPZ3R0MXR3NkI1NU1QWlhuUEVyMkZqbl9McXMybkNkLTJWZU9CMlVNV0lHN09oc2lSQ0NtWVJMSzduSy1EMFBMY1dZVXl6MW5PZkY0Sm1XcWdBVWo5THUzbGVNR0RvRUtqRVJwNWtNbjJDNlNjcTh4T0pRN1RSR2R1c3J0MS1faVBOWlBJUWh2aTc1Q0pyR3RvZF9PMUQtYmloaWZFS3ZDXzZDRzZ0Vkl5MWx0N2VHa3hfLXlCMC13WlY4WWRwWFVrdWJMb0NGd0ZhWkpuckc0cFA4VFdvRUJ0a1dIWlJjclFleGZfNUJMX2NfVmg5RkxxZXczU05CeVI4NkZreVVyQQ=="

GlobalVariable.tempdeviceId = "02-128254519"

			//**********For multisite WS and different channels ***********
			//Assign a tempbrand empty GV the index value of the GV list Brand

GlobalVariable.tempbrand = (GlobalVariable.brand[0]) //WS

			//Assign a tempchannel empty GV the index value of the GV list channel
GlobalVariable.tempchannel = (GlobalVariable.channel[0]) //app

			//Print the values of the list
println(GlobalVariable.tempbrand)
println(GlobalVariable.tempchannel)

response = WS.sendRequest(findTestObject('Postman/Postman/AuthService-Valid Header'))

println(response.getResponseBodyContent())

WS.verifyResponseStatusCode(response, 200)

WS.verifyElementPropertyValue(response, 'result.deviceId', '02-128254519')

GlobalVariable.tempchannel = (GlobalVariable.channel[1]) //wap

println(GlobalVariable.tempchannel)

response = WS.sendRequest(findTestObject('Postman/Postman/AuthService-Valid Header'))

println(response.getResponseBodyContent())

WS.verifyResponseStatusCode(response, 200)

GlobalVariable.tempchannel = (GlobalVariable.channel[2]) //web

println(GlobalVariable.tempchannel)

response = WS.sendRequest(findTestObject('Postman/Postman/AuthService-Valid Header'))

println(response.getResponseBodyContent())

WS.verifyResponseStatusCode(response, 200)

			//**********For multisite GAP and different channels ***********

GlobalVariable.tempbrand = (GlobalVariable.brand[1]) //GAP

GlobalVariable.tempchannel = (GlobalVariable.channel[0]) //--------------------------app

			//Print the values of the list
println(GlobalVariable.tempbrand)
println(GlobalVariable.tempchannel)

response = WS.sendRequest(findTestObject('Postman/Postman/AuthService-Valid Header'))

println(response.getResponseBodyContent())

WS.verifyResponseStatusCode(response, 200)

WS.verifyElementPropertyValue(response, 'result.deviceId', '02-128254519')

GlobalVariable.tempchannel = (GlobalVariable.channel[1]) //--------------------------wap

println(GlobalVariable.tempchannel)

response = WS.sendRequest(findTestObject('Postman/Postman/AuthService-Valid Header'))

println(response.getResponseBodyContent())

WS.verifyResponseStatusCode(response, 200)

GlobalVariable.tempchannel = (GlobalVariable.channel[2]) //----------------------------web

println(GlobalVariable.tempchannel)

response = WS.sendRequest(findTestObject('Postman/Postman/AuthService-Valid Header'))

println(response.getResponseBodyContent())

WS.verifyResponseStatusCode(response, 200)


					//**********For multisite LP and different channels ***********
 
 GlobalVariable.tempbrand = (GlobalVariable.brand[2]) //LP
 
  GlobalVariable.tempchannel = (GlobalVariable.channel[0]) //--------------------------app
 
println (GlobalVariable.tempchannel) 
 response = WS.sendRequest(findTestObject('Postman/Postman/AuthService-Valid Header'))
 
 println(response.getResponseBodyContent())
 
 WS.verifyResponseStatusCode(response, 200)
 
 GlobalVariable.tempchannel = (GlobalVariable.channel[1]) //----------------------------wap
 
 println(GlobalVariable.tempchannel)
 
 response = WS.sendRequest(findTestObject('Postman/Postman/AuthService-Valid Header'))
 
 println(response.getResponseBodyContent())
 
 WS.verifyResponseStatusCode(response, 200)
 
 GlobalVariable.tempchannel = (GlobalVariable.channel[2]) //---------------------------web
 
 println(GlobalVariable.tempchannel)
 
 response = WS.sendRequest(findTestObject('Postman/Postman/AuthService-Valid Header'))
 
 println(response.getResponseBodyContent())
 
 WS.verifyResponseStatusCode(response, 200)
 
 WS.verifyElementPropertyValue(response, 'result.deviceId', '02-128254519')
 
 				//**********For multisite SBB and different channels ***********
  
  GlobalVariable.tempbrand = (GlobalVariable.brand[3]) //SBB
  
  GlobalVariable.tempchannel = (GlobalVariable.channel[0]) //--------------------------app
  
			  //Print the values of the list
  println(GlobalVariable.tempbrand)
  println(GlobalVariable.tempchannel)
  
  response = WS.sendRequest(findTestObject('Postman/Postman/AuthService-Valid Header'))
  
  println(response.getResponseBodyContent())
  
  WS.verifyResponseStatusCode(response, 200)
  
  WS.verifyElementPropertyValue(response, 'result.deviceId', '02-128254519')
  
  GlobalVariable.tempchannel = (GlobalVariable.channel[1]) //--------------------------wap
  
  println(GlobalVariable.tempchannel)
  
  response = WS.sendRequest(findTestObject('Postman/Postman/AuthService-Valid Header'))
  
  println(response.getResponseBodyContent())
  
  WS.verifyResponseStatusCode(response, 200)
  
  GlobalVariable.tempchannel = (GlobalVariable.channel[2]) //----------------------------web
  
  println(GlobalVariable.tempchannel)
  
  response = WS.sendRequest(findTestObject('Postman/Postman/AuthService-Valid Header'))
  
  println(response.getResponseBodyContent())
  
  WS.verifyResponseStatusCode(response, 200)
  
 

				//**********For multisite TRU and different channels ***********
 
 GlobalVariable.tempbrand = (GlobalVariable.brand[4]) //TRU
 
 GlobalVariable.tempchannel = (GlobalVariable.channel[0]) //--------------------------app
 
			 //Print the values of the list
 println(GlobalVariable.tempbrand)
 println(GlobalVariable.tempchannel)
 
 response = WS.sendRequest(findTestObject('Postman/Postman/AuthService-Valid Header'))
 
 println(response.getResponseBodyContent())
 
 WS.verifyResponseStatusCode(response, 200)
 
 WS.verifyElementPropertyValue(response, 'result.deviceId', '02-128254519')
 
 GlobalVariable.tempchannel = (GlobalVariable.channel[1]) //--------------------------wap
 
 println(GlobalVariable.tempchannel)
 
 response = WS.sendRequest(findTestObject('Postman/Postman/AuthService-Valid Header'))
 
 println(response.getResponseBodyContent())
  
 WS.verifyResponseStatusCode(response, 200)
 
 GlobalVariable.tempchannel = (GlobalVariable.channel[2]) //----------------------------web
 
 println(GlobalVariable.tempchannel)
 
 response = WS.sendRequest(findTestObject('Postman/Postman/AuthService-Valid Header'))
 
 println(response.getResponseBodyContent())
 
 WS.verifyResponseStatusCode(response, 200)
 

 