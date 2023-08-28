object Q2{
    def main(args: Array[String]): Unit ={
        var strList: List[String]=  List("apple", "banana", "cherry", "date");
        println("Total count of letter occurrences: " + countLetterOccurrences(strList));

    }

    def countLetterOccurrences(strList: List[String]): Int = {
        var strList_lengths = strList.map(str => str.length());
        var totalLength = strList_lengths.reduce((x, y) => x+y);
        totalLength;
    }
}
