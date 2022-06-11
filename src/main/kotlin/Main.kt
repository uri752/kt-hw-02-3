fun main(){
    var isMeloman: Boolean
    var sum: Float

    isMeloman = true
    sum = 17500f

    var newSum = getDiscount(sum, isMeloman)
    println("sum $sum -> new sum $newSum")
}

fun getDiscount(sum: Float, isMeloman: Boolean): Float {

    var discount: Float = when{
        sum>=0 && sum<=1000         -> 0f
        sum>=1001 && sum<=10_000    -> 100f
        sum>10_001                  -> sum * 5 / 100;
        else                        -> 0f
    }

    var newSum: Float = sum - discount

    if(isMeloman){
        discount = newSum * 1 / 100
        newSum -= discount // доп скидка для постоянных клиентов-меломанов
    }
    return newSum
}