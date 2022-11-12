const { contar } = require('../algoritmos-fundamentais');

test('Deve contar 2 elementos', () => {
    const resultado = contar(-20, [1, 2, 5.5, -2, 10, -85]);
    expect(resultado).toBe(2);
});

test('Deve contar 3 elementos', () => {
    const resultado = contar(10, [1, 2, 5.5, -2, 10, -85]);
    expect(resultado).toBe(3);
});