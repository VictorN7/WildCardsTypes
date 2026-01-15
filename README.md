# 🃏 WildcardsTypes em Java — Wildcard não limitado (`?`)

### ❓ O que é:
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
