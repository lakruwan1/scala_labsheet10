object Q1{
    def main(args: Array[String]): Unit ={
        var tempList: List[Double] = List(0, 10, 20, 30);
        println("Average Fahrenheit Temperature= "+ calculateAverage(tempList));
    }

    var celciusTOFahrenheit = (tempList: List[Double]) => {tempList.map(temp => temp*1.8 + 32);}

    var totalTemp = (tempList: List[Double]) => {
        tempList.reduce((x, y) => x+y);
    }

    def calculateAverage(tempList:List[Double]): Double = {
        var sizeOfList = tempList.size;
        var fahrenheitTempList = celciusTOFahrenheit(tempList);
        var totalFahrenheitTemp = totalTemp(fahrenheitTempList);
        totalFahrenheitTemp/sizeOfList.toDouble;
    }
}
