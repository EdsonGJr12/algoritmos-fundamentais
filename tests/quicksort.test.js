const { aplicarQuickSort } = require('../algoritmos-fundamentais');

test('Array retornado tem a mesma quantidade de elementos', () => {
    let arrayParaOrdenar = [5, 1, 4, 2, 3];
    const arrayOrdenado = aplicarQuickSort(arrayParaOrdenar, 0, arrayParaOrdenar.length);
    expect(arrayOrdenado.length).toBe(arrayParaOrdenar.length);
});

test('Primeiro elemento é o 1', () => {
    let arrayParaOrdenar = [5, 1, 4, 2, 3];
    const arrayOrdenado = aplicarQuickSort(arrayParaOrdenar, 0, arrayParaOrdenar.length);
    expect(arrayOrdenado[0]).toBe(1);
});

test('Último elemento é o 5', () => {
    let arrayParaOrdenar = [5, 1, 4, 2, 3];
    const arrayOrdenado = aplicarQuickSort(arrayParaOrdenar, 0, arrayParaOrdenar.length);
    expect(arrayOrdenado[arrayOrdenado.length - 1]).toBe(5);
});

