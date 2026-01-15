# 🃏 WildcardsTypes em Java — `?`

### ❓O que é:
Representa um tipo desconhecido, podendo ser qualquer tipo.

### 💭 Para que serve:
Usado quando o tipo dos elementos não importa, apenas que eles possam ser lidos.  
Ideal para métodos genéricos que apenas percorrem, exibem ou processam dados.

### 🙋‍♂️ Exemplo de uso:
Quando o método apenas percorre ou exibe os elementos:

```java
void imprimir(List<?> lista) {
    for (Object obj : lista) {
        System.out.println(obj);
    }
}

```

### 📌 Resumo

- Aceita qualquer tipo
- Você só pode ler os valores
- Não permite adicionar elementos (exceto `null`)
- Ideal quando o tipo não importa


### ⚔️ `?` vs outros wildcards

| Característica      | `?`                  | `? extends T`         | `? super T`          |
|--------------------|----------------------|-----------------------|----------------------|
| Tipo               | Desconhecido          | Subclasse de `T`      | Superclasse de `T`   |
| Pode ler           | ✅ Sim (Object)       | ✅ Sim (`T`)           | ✅ Sim (Object)       |
| Pode adicionar     | ❌ Não                | ❌ Não                | ✅ Sim (`T`)          |
| Foco               | Leitura genérica      | Leitura               | Escrita               |
| Quando usar        | Tipo irrelevante      | Consome dados         | Produz dados          |
