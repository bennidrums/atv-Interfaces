# Atividade de Interfaces - Sistema de Notificação

Esse projeto foi desenvolvido como parte dos estudos de Java na EBAC. A atividade usa um exemplo simples de cadastro de usuários para praticar interfaces e injeção de dependência.

## O que o programa faz

- Registra usuários pelo método `UsuarioService`.
- Envia uma mensagem de boas-vindas simulada no terminal.
- Permite escolher entre três formas de notificação: e-mail, SMS e WhatsApp.

As notificações são apenas mensagens exibidas no console. O projeto não se conecta a serviços reais de e-mail, SMS ou WhatsApp.

## Conceitos praticados

- Interfaces com `Notificador`
- Implementação de interface com `implements`
- Sobrescrita de método com `@Override`
- Injeção de dependência pelo construtor
- Separação de responsabilidades em classes e pacotes
- Polimorfismo: o `UsuarioService` recebe diferentes implementações de `Notificador`

## Como executar

1. Abra o projeto em uma IDE que suporte Java, como o IntelliJ IDEA.
2. Confira se o JDK está configurado.
3. Execute a classe `NotificacaoMain`.
4. Confira as mensagens exibidas no terminal.

## Objetivo

A ideia foi entender como uma interface permite que uma classe trabalhe com diferentes implementações sem precisar conhecer os detalhes de cada uma. Assim, o serviço de usuário pode usar e-mail, SMS ou WhatsApp por meio do mesmo contrato.
