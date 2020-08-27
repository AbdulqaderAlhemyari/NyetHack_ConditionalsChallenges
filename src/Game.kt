fun main()
{
    var healthPoints=83
    val karma = (Math.pow(Math.random(), (110 - healthPoints) / 100.0) * 20 ).toInt()
    var AuraColor:String;

    AuraColor= when(karma)
    {
        in 0..5 -> "red"
        in 6..10 -> "orange"
        in 11..15 -> "purple"
        in 16..20 -> "green"
        else -> ""
    }

    println(AuraColor)

}