@echo off
cd /d %~dp0

REM Check if a commit message was provided
IF "%~1"=="" (
    echo Commit message missing.
    echo Usage: push.bat "Your commit message here"
    pause
    exit /b
)

REM Join all arguments into a single message string
SETLOCAL ENABLEDELAYEDEXPANSION
SET "msg="
:loop
IF NOT "%~1"=="" (
    SET "msg=!msg! %~1"
    SHIFT
    GOTO loop
)

REM Trim leading space
SET "msg=%msg:~1%"

REM Stage all changes
git add .

REM Commit with message
git commit -m "%msg%"

REM Push to GitHub
git push

REM Keep terminal open so you can read status
pause
