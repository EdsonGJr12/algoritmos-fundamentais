const { aplicarFibonacci } = require('../algoritmos-fundamentais');

test('O próximo elemento deve ser 1', () => {
    let arrayFibonacci = [0, 1];
    arrayFibonacci = aplicarFibonacci(arrayFibonacci);
    expect(arrayFibonacci[1]).toBe(1);
});

test('Deve retornar um array de 3 posições', () => {
    let arrayFibonacci = [0, 1];
    arrayFibonacci = aplicarFibonacci(arrayFibonacci);
    expect(arrayFibonacci.length).toBe(3);
});

