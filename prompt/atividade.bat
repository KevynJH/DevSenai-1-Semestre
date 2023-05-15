@echo off
cls
:menu
cls
color 80

date /t

echo Computador: %computername%         Usuario: %username%



echo            MENU DE TAREFAS
echo  ==================================================================
echo * 1. Rodar scannow, Limpar Lixeira, Reiniciar computador           *
echo * 2. Deletar arquivos lixeira, Desligar computador                 *
echo * 3. Desligar computador após 30 seg                               *
echo * 4. Sair                                                          *
echo  ===================================================================

set/p opcao= Escolha uma opcao:
echo -----------------------------
if %opcao% equ 1 goto opcao1
if %opcao% equ 2 goto opcao2
if %opcao% equ 3 goto opcao3
if %opcao% equ 4 goto opcao4

:opcao1
cls
sfc /scannow
echo ====================================================================
echo *             Verificando se há arquivos corrompidos                *
echo ====================================================================
/S /Q c:\$Recycle.bin
echo ==============================================
echo *             Esvaziando a Lixeira            *
echo ==============================================
shutdown /R
echo =================================================
echo *             Reiniciando o computador           *
echo =================================================
pause
goto menu





