import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl(GlobalVariable.homepageUrl)

WebUI.click(findTestObject('HomePage/myAccountMenu'))

WebUI.click(findTestObject('HomePage/loginSubmenu'))

CustomKeywords.'customcommands.WaitVisibleAndSetValue.waitVisibleAndSetValue'(findTestObject('LoginPage/usernameField'), 
    findTestData('Input').getValue('Value', 1))

CustomKeywords.'customcommands.WaitVisibleAndSetValue.waitVisibleAndSetValue'(findTestObject('LoginPage/passwordField'), 
    findTestData('Input').getValue('Value', 2))

WebUI.waitForElementVisible(findTestObject('LoginPage/loginBtn'), 0)

WebUI.click(findTestObject('LoginPage/loginBtn'))

WebUI.waitForElementNotPresent(findTestObject('LoginPage/loginSpiel'), 0)

WebUI.verifyElementVisible(findTestObject('MyAccountPage/accountHeader'))

WebUI.verifyElementText(findTestObject('MyAccountPage/accountHeader'), ('Hi, ' + findTestData('Input').getValue('Value', 
        3)) + ' ' + findTestData('Input').getValue('Value', 4))

WebUI.closeBrowser()

