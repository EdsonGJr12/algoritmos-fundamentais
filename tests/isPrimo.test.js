const { isPrimo } = require('../algoritmos-fundamentais');

test('O número 1 não é primo', () => {
    const resultado = isPrimo(1);
    expect(resultado).toBe(false);
});

test('O número 7 é primo', () => {
    const resultado = isPrimo(7);
    expect(resultado).toBe(true);
});