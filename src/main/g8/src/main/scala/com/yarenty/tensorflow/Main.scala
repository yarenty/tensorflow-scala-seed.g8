package com.yarenty.tensorflow

import org.tensorflow.Graph
import org.tensorflow.Session
import org.tensorflow.Tensor
import org.tensorflow.TensorFlow


object Main {

  @throws[Exception]
  def main(args: Array[String]): Unit = {
    val g = new Graph()

    val value = "Hello from " + TensorFlow.version


    // Construct the computation graph with a single operation, a constant
    // named "MyConst" with a value "value".
    val t = Tensor.create(value.getBytes("UTF-8"))
    g.opBuilder("Const", "MyConst").setAttr("dtype", t.dataType).setAttr("value", t).build

    if (t != null) t.close()

    // Execute the "MyConst" operation in a Session.
    val s = new Session(g)
    val output = s.runner.fetch("MyConst").run.get(0)

    System.out.println(new String(output.bytesValue, "UTF-8")) // scalastyle:ignore



    if (s != null) s.close()
    if (output != null) output.close()
    if (g != null) g.close()
  }
  

}