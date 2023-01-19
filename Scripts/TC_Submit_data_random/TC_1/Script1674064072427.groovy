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
import com.github.javafaker.Faker as Faker

Faker faker = new Faker(new Locale('id-ID'))

String name = faker.name().username() // Miss Samanta Schmidt

WebUI.openBrowser('')


for (int i=1; i<2 ; i++) {
	WebUI.navigateToUrl('https://cfra321.github.io/loginJavaScript.github.io/?username=&password=&password=')
	
	WebUI.maximizeWindow()
	
	WebUI.click(findTestObject('Object Repository/Page_Form Login/button_Klik Disini Untuk Mendaftar'))
	
	WebUI.delay(1)
	
	WebUI.setText(findTestObject('Object Repository/Page_Form Login/input_Nama User_username'), name)
	
	WebUI.delay(1)
	
	WebUI.setText(findTestObject('Object Repository/Page_Form Login/input_Nomor Handphone_username'), '082297334277')
	
	WebUI.delay(1)
	
	WebUI.setText(findTestObject('Object Repository/Page_Form Login/input_Username_username'), name + '@gmail.com')
	
	WebUI.delay(1)
	
	WebUI.setEncryptedText(findTestObject('Object Repository/Page_Form Login/input_Password_password'), 'aeHFOx8jV/A=')
	
	WebUI.delay(1)
	
	WebUI.click(findTestObject('Object Repository/Page_Form Login/button_submit'))
	
}