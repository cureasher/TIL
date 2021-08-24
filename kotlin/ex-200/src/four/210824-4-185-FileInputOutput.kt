package code.four

import java.io.*

fun main(args: Array<String>) {
    val file = File("./hello.txt")

    if(!file.exists())
        file.createNewFile()

    val outputStream: OutputStream = file.outputStream()
    outputStream.write(35)

    val outputStreamWrite: OutputStreamWriter = outputStream.writer()
    outputStreamWrite.write("파일 입출력")
    outputStreamWrite.close()

    val inputStream: InputStream = file.inputStream()
    println(inputStream.read())

    val inputStreamReader: InputStreamReader = inputStream.reader()
    println(inputStreamReader.readText())
    inputStreamReader.close()
}