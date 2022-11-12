const { maximoDivisorComum } = require('../algoritmos-fundamentais');

test('MDC deve ser 1', () => {
    const resultado = maximoDivisorComum(1, 1);
    expect(resultado).toBe(1);
});

test('MDC deve ser 5', () => {
    const resultado = maximoDivisorComum(5, 10);
    expect(resultado).toBe(5);
});

