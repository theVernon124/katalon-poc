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
import groovy.time.TimeCategory

checkinDate = null

checkoutDate = null

use(TimeCategory,
	{checkinDate = (new Date() + 1.week)
	checkoutDate = (checkinDate + 1.week)
	})

WebUI.openBrowser('')

WebUI.navigateToUrl(GlobalVariable.homepageUrl)

WebUI.click(locationField)

CustomKeywords.'customcommands.WaitVisibleAndSetValue.waitVisibleAndSetValue'(locationTextArea, testData.getValue('Value', 
        5))

WebUI.modifyObjectProperty(locationSearchSuggestion, 'css', 'equals',
	('.select2-results > li > div:contains("Location") + ul > li > div:contains("' + testData.getValue('Value', 5)) + '")', true)

WebUI.waitForElementVisible(locationSearchSuggestion, GlobalVariable.timeout)

WebUI.click(locationSearchSuggestion)

CustomKeywords.'customcommands.WaitVisibleAndSetValue.waitVisibleAndSetValue'(checkinDateField, checkinDate.format('dd/MM/yyyy'))

CustomKeywords.'customcommands.WaitVisibleAndSetValue.waitVisibleAndSetValue'(checkoutDateField, checkoutDate.format('dd/MM/yyyy'))

WebUI.click(searchBtn)

WebUI.click(WebUI.modifyObjectProperty(hotelNameLink, 'css', 'equals', ('table.bgwhite > tbody > tr > td > div > div > h4 > a:contains("' + 
        testData.getValue('Value', 6)) + '")', true))

WebUI.click(WebUI.modifyObjectProperty(bookRoomBtn, 'css', 'equals', ('table.bgwhite > tbody > tr > td > div > div:contains("' + 
        testData.getValue('Value', 7)) + '") + div > div > div > div > button.book_button', true))

WebUI.setText(firstNameField, testData.getValue('Value', 8))

WebUI.setText(lastNameField, testData.getValue('Value', 9))

WebUI.setText(emailField, testData.getValue('Value', 10))

WebUI.setText(confirmEmailField, testData.getValue('Value', 10))

WebUI.setText(mobileNumberField, testData.getValue('Value', 11))

WebUI.setText(addressField, testData.getValue('Value', 12))

WebUI.selectOptionByLabel(countryDropdown, testData.getValue('Value', 13), false)

WebUI.click(confirmBookingBtn)

WebUI.verifyElementText(invoiceHeader, spiels.getValue('Value', 1))

WebUI.verifyElementText(customerNameLabel, testData.getValue('Value', 8) + ' ' + testData.getValue('Value', 9))

WebUI.verifyElementText(customerAddressLabel, testData.getValue('Value', 12))

WebUI.verifyElementText(customerMobileLabel, testData.getValue('Value', 11))

WebUI.verifyElementText(hotelNameLabel, testData.getValue('Value', 6))

WebUI.verifyElementText(roomNameLabel, 'Room : ' + testData.getValue('Value', 7))

WebUI.verifyElementText(checkinDateLabel, checkinDate.format('dd/MM/yyyy'))

WebUI.verifyElementText(checkoutDateLabel, checkoutDate.format('dd/MM/yyyy'))

WebUI.closeBrowser()

