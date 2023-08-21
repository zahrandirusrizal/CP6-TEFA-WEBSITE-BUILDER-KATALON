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

'Membuka browser'
WebUI.openBrowser('')

'Navigasi ke aplikasi website, dengan link https://website-builder-psi.vercel.app/'
WebUI.navigateToUrl(GlobalVariable.url)

'Memastikan logo/text website builder terlihat'
WebUI.verifyElementVisible(findTestObject('Landing Page/WB Logo'))

'Memastikan hypertext link login terlihat'
WebUI.verifyElementVisible(findTestObject('Landing Page/Login Hyperlink Text'))

'Memastikan tombol "Get Started" terlihat'
WebUI.verifyElementVisible(findTestObject('Landing Page/Get Started Button'))

'Memastikan text "Create a website without limits" terlihat'
WebUI.verifyElementVisible(findTestObject('Landing Page/Landing Page_Create a website without limits'))

'Memastikan text "Build and scale with confidence. From a powerful website builder to advanced business solutions—we’ve got you covered" terlihat\r\n\r\n'
WebUI.verifyElementVisible(findTestObject('Landing Page/Landing Page_Build and scale with confidence'))

'Memastikan text "Try WB. No credit card required." terlihat'
WebUI.verifyElementVisible(findTestObject('Landing Page/Landing Page_Try WB. No credit card required'))

'Memastikan gambar contoh dari website yang dibuat melalui Website Builder terlihat'
WebUI.verifyElementVisible(findTestObject('Landing Page/Website Example Image'))

'Memastikan text "One platform, infinite possibilities" terlihat'
WebUI.verifyElementVisible(findTestObject('Landing Page/Landing Page_One platform,infinite possibilities'))

'Memastikan text " Unlimited creation Create a website with a complete suite of advanced functionalities and bring your vision to life."\r\n, "Powerful infrastructureGet an enterprise-grade foundation, engineered for your limitless scalability and peace of mind."\r\n, dan "The place for growth Convert and scale seamlessly with built-in marketing and business solutions."\r\nterlihat\r\n\r\n\r\n'
WebUI.verifyElementVisible(findTestObject('Landing Page/Landing Page_Unlimited Creation, Powerful Infrastructure, The place for growth title and description'))

'Memastikan text "Website templates that set you up for success" terlihat'
WebUI.verifyElementVisible(findTestObject('Landing Page/Landing Page_Website templates that set you up for success'))

'Memastikan text "Get a headstart on your journey with 900+ free, customizable website templates, strategically\r\nresearched and tailored for every industry — or start from a blank canvas on our website builder." terlihat'
WebUI.verifyElementVisible(findTestObject('Landing Page/Landing Page_Get a headstart on your journey with 900'))

'Menutup browser'
WebUI.closeBrowser()

