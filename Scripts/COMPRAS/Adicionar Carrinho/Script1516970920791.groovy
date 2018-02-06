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

WebUI.click(findTestObject('AdicionarCarrinho/a_Entre'))

WebUI.setText(findTestObject('AdicionarCarrinho/input_cpf'), '10238621405')

WebUI.setText(findTestObject('AdicionarCarrinho/input_senha'), '1234asdF')

WebUI.click(findTestObject('AdicionarCarrinho/input_ok'))

WebUI.click(findTestObject('AdicionarCarrinho/h3_Custos para produzir No Cam'))

WebUI.click(findTestObject('AdicionarCarrinho/a_Adicionar ao carrinho'))

WebUI.click(findTestObject('AdicionarCarrinho/button_Entendi e estou de acor'))

WebUI.click(findTestObject('AdicionarCarrinho/div_Meu Carrinho'))

WebUI.check(findTestObject('AdicionarCarrinho/span_Cursos Adicionados'))

WebUI.closeBrowser()

