package com.ejercicio

import com.ejercicio.funciones.Calcular

object Main {

  def main(args: Array[String]): Unit = {
    println("------------------------------------------")
    println("Total Bruto: " + Calcular.totalBruto())
    println("IVA: " + Calcular.valorDelIva())
    println("IMP Consumo: " + Calcular.valorDeImpuesto())
    println("El Valor Total es: " + Calcular.totalGeneral())
    println("------------------------------------------")

  }


}
