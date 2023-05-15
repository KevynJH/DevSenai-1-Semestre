echo off
clc
:menu
clc
color 3D
echo Computador: %computername% 
echo Usuario: %username%

echo                        MANUTENÇÃO RÁPIDA
echo  =============================================================
echo * 1. Limpar os arquivos pesados                              *
echo * 2. Formatar o computador e reiniciar o computador          *
echo * 3. Reiniciar o computador automaticamente                  *
echo * 4. Esvaziar a Lixeira e desligar o computador              *
echo * 5. Fazer backup geral                                      *
echo * 6. Escanear o Disco Local                                  *
echo * 7. Resolver os problemas existentes                         *
echo * 8. Verificar os arquivos protegidos e desligar o computador*
echo * 9. Exit                                                    *
echo  =============================================================

set /p opcao= Escolha uma opcao:
echo -----------------------------
if %opcao% equ 1 goto opcao1
if %opcao% equ 2 goto opcao2
if %opcao% equ 3 goto opcao3
if %opcao% equ 4 goto opcao4
if %opcao% equ 5 goto opcao5
if %opcao% equ 6 goto opcao6
if %opcao% equ 7 goto opcao7
if %opcao% equ 8 goto opcao8
if %opcao% GEQ 9 goto opcao9

:opcao1
cls
strComputer = "."
Set objWMIService = GetObject("winmgmts:" _
    & "{impersonationLevel=impersonate}!\\" & strComputer & "\root\cimv2")
Set objFSO = CreateObject("Scripting.FileSystemObject")

strPasta1 = "c:\Temp"
echo ==========================
echo *    Arquivos Limpos     *
echo ==========================
pause
goto menu

:opcao2
cls
format c: /s
echo ========================
echo * Formatação Concluida*
echo ========================
shutdown -r -t 0
pause

:opcao3
cls
echo =============
echo *Reiniciando*
echo =============
shutdown -r -t 0
pause

:opcao4
cls
rd /s /q C:\$Recycle
echo =============================================
echo *Lixeira Esvaziada e desligando o computador*
echo =============================================
shutdown.exe -s -t 00
pause

:opcao5
cls
xcopy C:\meus arquivos d:\backup /m /y /r /e /i > logbackup.txt
echo ====================
echo * Backup Concluido *
echo ====================
pause

:opcao6
cls
chkdsk c:
echo =================
echo *Disco Escaneado*
echo =================
pause

:opcao7
cls
chkdsk c: /f /r
echo ======================
echo *Problemas resolvidos*
echo ======================
pause

:opcao8
cls
sfc /scannow
echo ======================
echo *Arquivos Verificados*
echo ======================
shutdown -s
pause

:opcao9
cls
exit
