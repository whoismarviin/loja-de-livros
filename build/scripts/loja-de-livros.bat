@rem
@rem Copyright 2015 the original author or authors.
@rem
@rem Licensed under the Apache License, Version 2.0 (the "License");
@rem you may not use this file except in compliance with the License.
@rem You may obtain a copy of the License at
@rem
@rem      https://www.apache.org/licenses/LICENSE-2.0
@rem
@rem Unless required by applicable law or agreed to in writing, software
@rem distributed under the License is distributed on an "AS IS" BASIS,
@rem WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
@rem See the License for the specific language governing permissions and
@rem limitations under the License.
@rem

@if "%DEBUG%" == "" @echo off
@rem ##########################################################################
@rem
@rem  loja-de-livros startup script for Windows
@rem
@rem ##########################################################################

@rem Set local scope for the variables with windows NT shell
if "%OS%"=="Windows_NT" setlocal

set DIRNAME=%~dp0
if "%DIRNAME%" == "" set DIRNAME=.
set APP_BASE_NAME=%~n0
set APP_HOME=%DIRNAME%..

@rem Resolve any "." and ".." in APP_HOME to make it shorter.
for %%i in ("%APP_HOME%") do set APP_HOME=%%~fi

@rem Add default JVM options here. You can also use JAVA_OPTS and LOJA_DE_LIVROS_OPTS to pass JVM options to this script.
set DEFAULT_JVM_OPTS=

@rem Find java.exe
if defined JAVA_HOME goto findJavaFromJavaHome

set JAVA_EXE=java.exe
%JAVA_EXE% -version >NUL 2>&1
if "%ERRORLEVEL%" == "0" goto execute

echo.
echo ERROR: JAVA_HOME is not set and no 'java' command could be found in your PATH.
echo.
echo Please set the JAVA_HOME variable in your environment to match the
echo location of your Java installation.

goto fail

:findJavaFromJavaHome
set JAVA_HOME=%JAVA_HOME:"=%
set JAVA_EXE=%JAVA_HOME%/bin/java.exe

if exist "%JAVA_EXE%" goto execute

echo.
echo ERROR: JAVA_HOME is set to an invalid directory: %JAVA_HOME%
echo.
echo Please set the JAVA_HOME variable in your environment to match the
echo location of your Java installation.

goto fail

:execute
@rem Setup the command line

set CLASSPATH=%APP_HOME%\lib\loja-de-livros-0.1.jar;%APP_HOME%\lib\micronaut-cassandra-3.1.1.jar;%APP_HOME%\lib\micronaut-nats-2.2.1.jar;%APP_HOME%\lib\micronaut-kotlin-runtime-2.3.1.jar;%APP_HOME%\lib\micronaut-http-client-2.5.4.jar;%APP_HOME%\lib\micronaut-http-client-core-2.5.4.jar;%APP_HOME%\lib\micronaut-http-server-netty-2.5.4.jar;%APP_HOME%\lib\micronaut-http-server-2.5.4.jar;%APP_HOME%\lib\micronaut-messaging-2.5.4.jar;%APP_HOME%\lib\micronaut-runtime-2.5.4.jar;%APP_HOME%\lib\micronaut-validation-2.5.4.jar;%APP_HOME%\lib\micronaut-http-netty-2.5.4.jar;%APP_HOME%\lib\micronaut-websocket-2.5.4.jar;%APP_HOME%\lib\micronaut-router-2.5.4.jar;%APP_HOME%\lib\micronaut-http-2.5.4.jar;%APP_HOME%\lib\micronaut-context-2.5.4.jar;%APP_HOME%\lib\micronaut-inject-java-2.5.4.jar;%APP_HOME%\lib\micronaut-aop-2.5.4.jar;%APP_HOME%\lib\micronaut-buffer-netty-2.5.4.jar;%APP_HOME%\lib\micronaut-inject-2.5.4.jar;%APP_HOME%\lib\javax.annotation-api-1.3.2.jar;%APP_HOME%\lib\jackson-datatype-jdk8-2.12.2.jar;%APP_HOME%\lib\jackson-datatype-jsr310-2.12.2.jar;%APP_HOME%\lib\java-driver-mapper-processor-4.9.0.jar;%APP_HOME%\lib\java-driver-mapper-runtime-4.9.0.jar;%APP_HOME%\lib\java-driver-query-builder-4.9.0.jar;%APP_HOME%\lib\java-driver-core-4.9.0.jar;%APP_HOME%\lib\jackson-databind-2.12.2.jar;%APP_HOME%\lib\jackson-annotations-2.12.2.jar;%APP_HOME%\lib\jackson-core-2.12.2.jar;%APP_HOME%\lib\jackson-module-kotlin-2.12.2.jar;%APP_HOME%\lib\kotlin-reflect-1.4.32.jar;%APP_HOME%\lib\kotlin-stdlib-jdk8-1.4.32.jar;%APP_HOME%\lib\logback-classic-1.2.3.jar;%APP_HOME%\lib\micronaut-core-reactive-2.5.4.jar;%APP_HOME%\lib\micronaut-core-2.5.4.jar;%APP_HOME%\lib\spotbugs-annotations-4.0.3.jar;%APP_HOME%\lib\jsr305-3.0.2.jar;%APP_HOME%\lib\tinkergraph-gremlin-3.4.8.jar;%APP_HOME%\lib\gremlin-core-3.4.8.jar;%APP_HOME%\lib\snakeyaml-1.26.jar;%APP_HOME%\lib\metrics-core-4.0.5.jar;%APP_HOME%\lib\jcl-over-slf4j-1.7.25.jar;%APP_HOME%\lib\slf4j-api-1.7.26.jar;%APP_HOME%\lib\reactive-streams-1.0.3.jar;%APP_HOME%\lib\rxjava-2.2.10.jar;%APP_HOME%\lib\validation-api-2.0.1.Final.jar;%APP_HOME%\lib\kotlin-stdlib-jdk7-1.4.32.jar;%APP_HOME%\lib\kotlin-stdlib-1.4.32.jar;%APP_HOME%\lib\netty-handler-proxy-4.1.64.Final.jar;%APP_HOME%\lib\netty-codec-http2-4.1.64.Final.jar;%APP_HOME%\lib\netty-codec-http-4.1.64.Final.jar;%APP_HOME%\lib\netty-codec-socks-4.1.64.Final.jar;%APP_HOME%\lib\netty-handler-4.1.64.Final.jar;%APP_HOME%\lib\netty-codec-4.1.64.Final.jar;%APP_HOME%\lib\netty-transport-4.1.64.Final.jar;%APP_HOME%\lib\netty-buffer-4.1.64.Final.jar;%APP_HOME%\lib\netty-resolver-4.1.64.Final.jar;%APP_HOME%\lib\netty-common-4.1.64.Final.jar;%APP_HOME%\lib\kotlin-stdlib-common-1.4.32.jar;%APP_HOME%\lib\javax.inject-1.jar;%APP_HOME%\lib\jnats-2.8.0.jar;%APP_HOME%\lib\config-1.4.1.jar;%APP_HOME%\lib\logback-core-1.2.3.jar;%APP_HOME%\lib\annotations-13.0.jar;%APP_HOME%\lib\native-protocol-1.4.11.jar;%APP_HOME%\lib\java-driver-shaded-guava-25.1-jre-graal-sub-1.jar;%APP_HOME%\lib\jnr-posix-3.0.50.jar;%APP_HOME%\lib\HdrHistogram-2.1.11.jar;%APP_HOME%\lib\esri-geometry-api-1.2.1.jar;%APP_HOME%\lib\jcip-annotations-1.0-1.jar;%APP_HOME%\lib\javapoet-1.11.1.jar;%APP_HOME%\lib\eddsa-0.3.0.jar;%APP_HOME%\lib\jnr-ffi-2.1.10.jar;%APP_HOME%\lib\jnr-constants-0.9.12.jar;%APP_HOME%\lib\json-20090211.jar;%APP_HOME%\lib\jackson-core-asl-1.9.12.jar;%APP_HOME%\lib\gremlin-shaded-3.4.8.jar;%APP_HOME%\lib\commons-configuration-1.10.jar;%APP_HOME%\lib\commons-collections-3.2.2.jar;%APP_HOME%\lib\commons-lang3-3.8.1.jar;%APP_HOME%\lib\javatuples-1.2.jar;%APP_HOME%\lib\jffi-1.2.19.jar;%APP_HOME%\lib\jffi-1.2.19-native.jar;%APP_HOME%\lib\asm-commons-7.1.jar;%APP_HOME%\lib\asm-util-7.1.jar;%APP_HOME%\lib\asm-analysis-7.1.jar;%APP_HOME%\lib\asm-tree-7.1.jar;%APP_HOME%\lib\asm-7.1.jar;%APP_HOME%\lib\jnr-a64asm-1.0.0.jar;%APP_HOME%\lib\jnr-x86asm-1.0.2.jar;%APP_HOME%\lib\commons-lang-2.6.jar;%APP_HOME%\lib\hppc-0.7.1.jar;%APP_HOME%\lib\jcabi-manifests-1.1.jar;%APP_HOME%\lib\exp4j-0.4.8.jar;%APP_HOME%\lib\jcabi-log-0.14.jar


@rem Execute loja-de-livros
"%JAVA_EXE%" %DEFAULT_JVM_OPTS% %JAVA_OPTS% %LOJA_DE_LIVROS_OPTS%  -classpath "%CLASSPATH%" br.com.example.ApplicationKt %*

:end
@rem End local scope for the variables with windows NT shell
if "%ERRORLEVEL%"=="0" goto mainEnd

:fail
rem Set variable LOJA_DE_LIVROS_EXIT_CONSOLE if you need the _script_ return code instead of
rem the _cmd.exe /c_ return code!
if  not "" == "%LOJA_DE_LIVROS_EXIT_CONSOLE%" exit 1
exit /b 1

:mainEnd
if "%OS%"=="Windows_NT" endlocal

:omega
