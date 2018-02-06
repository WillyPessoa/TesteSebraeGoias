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

WebUI.navigateToUrl('https://lojavirtualhomolog.sebraego.com.br/loja/')

WebUI.click(findTestObject('MinhasInscricoes/Page_SebraeGO  Loja Virtual - Curso/a_Entre'))

WebUI.setText(findTestObject('MinhasInscricoes/Page_SebraeGO - Loja Virtual - Logi/input_cpf'), '10238621405')

WebUI.setText(findTestObject('MinhasInscricoes/Page_SebraeGO - Loja Virtual - Logi/input_senha'), '1234asdF')

WebUI.click(findTestObject('MinhasInscricoes/Page_SebraeGO - Loja Virtual - Logi/input_ok'))

WebUI.click(findTestObject('MinhasInscricoes/Page_SebraeGO  Loja Virtual - Curso/span_caret'))

WebUI.click(findTestObject('MinhasInscricoes/Page_SebraeGO  Loja Virtual - Curso/a_Minhas inscries'))

WebUI.selectOptionByValue(findTestObject('MinhasInscricoes/Page_SebraeGO  Loja Virtual - Minha/select_Selecione um statusPEND'), 
    '2', true)

WebUI.click(findTestObject('MinhasInscricoes/Page_SebraeGO  Loja Virtual - Minha/input_btnFiltrar'))

WebUI.verifyElementText(findTestObject('MinhasInscricoes/Page_SebraeGO  Loja Virtual - Minha/a_Comprovante de inscrio'), 
    'Comprovante de inscrição')

WebUI.closeBrowser()

