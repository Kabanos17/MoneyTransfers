package ru.netology

fun main() {
    // Сумма перевода в рублях
    val amount = readlnOrNull()?.toDoubleOrNull() ?: return

    // Процент комиссии
    val commissionRate = 0.0075

    // Минимальная комиссия
    val minCommission = 35.0

    // Вычисление комиссии
    var commission = amount * commissionRate

    // Проверка на минимальную комиссию
    if (commission < minCommission) {
        commission = minCommission
    }

    // Вывод комиссии
    println("Размер комиссии: %.2f рублей".format(commission))
}
