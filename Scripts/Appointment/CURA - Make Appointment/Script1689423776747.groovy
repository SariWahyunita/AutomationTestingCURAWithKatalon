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

WebUI.verifyElementText(findTestObject('Page_Make Appointment/h2_Make Appointment'), 'Make Appointment')

WebUI.takeScreenshot()

WebUI.getNumberOfSelectedOption(findTestObject('Page_Make Appointment/select_facility'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Make Appointment/select_facility'), 'Hongkong CURA Healthcare Center', 
    true)

WebUI.click(findTestObject('Object Repository/Page_Make Appointment/input_Apply for hospital readmission_hospit_63901f'))

WebUI.click(findTestObject('Object Repository/Page_Make Appointment/input_Medicaid_programs'))

WebUI.setText(findTestObject('Object Repository/Page_Make Appointment/input_Visit Date (Required)'), '01/07/2023')

WebUI.setText(findTestObject('Object Repository/Page_Make Appointment/textarea_Comment'), 'Test 1')

WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/Page_Make Appointment/button_Book Appointment'))

WebUI.takeScreenshot()

WebUI.verifyElementText(findTestObject('Page_SummaryAppointment/p_facility'), 'Hongkong CURA Healthcare Center')

WebUI.verifyElementText(findTestObject('Page_SummaryAppointment/p_apply_for_hospital_readmission'), 'Yes')

WebUI.verifyElementText(findTestObject('Page_SummaryAppointment/p_healthcare_program'), 'Medicaid')

WebUI.verifyElementText(findTestObject('Page_SummaryAppointment/p_visit_date'), '01/07/2023')

WebUI.verifyElementText(findTestObject('Page_SummaryAppointment/p_comment'), 'Test 1')

WebUI.verifyElementText(findTestObject('Page_SummaryAppointment/h2_Appointment Confirmation'), 'Appointment Confirmation')

