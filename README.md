# Sistema de Gestão de Eventos

## Integrantes
- Artur de Ávila  
- Deivid Matos  

---

## Descrição do Projeto

O **Sistema de Gestão de Eventos** é uma aplicação desenvolvida para simplificar o processo de organização, controle e participação em eventos.  
A plataforma permite que organizadores criem e gerenciem eventos, atribuam papéis aos usuários e mantenham um controle eficiente das inscrições e confirmações de presença.  
O sistema busca proporcionar uma experiência prática, intuitiva e eficiente tanto para organizadores quanto para participantes.

---

## Funcionalidades Principais

### 1. Cadastro de Eventos
- Permite o registro de novos eventos com informações detalhadas como nome, local, data, hora e endereço.  
- Os eventos podem ser associados a uma categoria específica, facilitando a organização e a busca.

### 2. Cadastro de Categorias
- Possibilita o cadastro de categorias de eventos, como "Seminário", "Workshop", "Conferência", entre outras.  
- Facilita a classificação e filtragem dos eventos pelo tipo.

### 3. Gestão de Usuários
- Usuários podem se cadastrar no sistema informando nome, e-mail e senha.  
- Após o cadastro, podem visualizar, se inscrever e gerenciar suas participações em eventos.

### 4. Participação e Confirmação
- Usuários podem se inscrever em eventos e confirmar sua presença.  
- Organizadores têm acesso à lista de confirmações para melhor planejamento do evento.

### 5. Gerenciamento de Papéis
- O organizador pode atribuir papéis específicos aos usuários, como “Organizador”, “Palestrante” ou “Participante”.  
- Permite o controle de responsabilidades e níveis de acesso dentro de cada evento.

### 6. Visualização de Eventos
- O sistema exibe todos os eventos cadastrados, com opções de filtro por categoria, nome ou data.  
- Facilita a descoberta de eventos de interesse pelos usuários.

### 7. Alteração e Exclusão de Eventos
- Organizadores podem editar informações de eventos existentes ou excluí-los, quando necessário.  
- Garante flexibilidade diante de mudanças de local, data ou outros detalhes.

### 8. Cancelamento de Participação
- Usuários podem cancelar sua participação em um evento caso não possam comparecer.  
- O organizador é notificado sobre o cancelamento.

---

## Histórias de Usuário

### 1. Cadastro de Evento
- **Como** organizador de eventos  
- **Eu gostaria de** cadastrar um novo evento com informações como nome, local, data, hora e endereço  
- **Para que** eu possa criar e gerenciar eventos para os participantes.

### 2. Cadastro de Categoria de Evento
- **Como** organizador de eventos  
- **Eu gostaria de** criar categorias para os eventos (ex: conferência, workshop, seminário)  
- **Para que** eu possa organizar os eventos por tipo e facilitar a busca dos usuários.

### 3. Cadastro de Usuário
- **Como** usuário  
- **Eu gostaria de** me cadastrar no sistema com meus dados pessoais (nome, e-mail e senha)  
- **Para que** eu possa participar de eventos e gerenciar minha participação.

### 4. Associação de Usuário ao Evento
- **Como** usuário  
- **Eu gostaria de** me inscrever em um evento  
- **Para que** eu possa participar e obter informações sobre ele.

### 5. Definição de Papéis no Evento
- **Como** organizador de eventos  
- **Eu gostaria de** atribuir papéis aos usuários (ex: organizador, participante, palestrante)  
- **Para que** eu possa controlar as responsabilidades de cada um durante o evento.

### 6. Confirmação de Participação
- **Como** organizador de evento  
- **Eu gostaria de** saber se os participantes confirmaram presença  
- **Para que** eu possa planejar o evento adequadamente.

### 7. Visualização de Evento
- **Como** usuário  
- **Eu gostaria de** visualizar todos os eventos disponíveis no sistema  
- **Para que** eu possa escolher em qual evento participar.

### 8. Edição de Evento
- **Como** organizador de eventos  
- **Eu gostaria de** editar um evento existente  
- **Para que** eu possa alterar os detalhes do evento, caso necessário.

### 9. Gerenciamento de Participantes
- **Como** organizador de evento  
- **Eu gostaria de** visualizar a lista de participantes confirmados  
- **Para que** eu possa controlar quem irá comparecer.

### 10. Desvinculação de Participação
- **Como** usuário  
- **Eu gostaria de** cancelar minha participação em um evento  
- **Para que** eu possa ser removido da lista de participantes se não puder comparecer.

---

## Tecnologias Utilizadas
- **Back-end:** Java / Spring Boot  
- **Front-end:** Angular  
- **Banco de Dados:** MySQL  
- **Arquitetura:** REST API / MVC  

---

## Objetivos do Sistema
- Facilitar o gerenciamento de eventos e participantes.  
- Permitir o controle detalhado de categorias e papéis.  
- Oferecer uma interface simples e eficiente para organizadores e usuários.  
- Tornar o processo de inscrição e acompanhamento de eventos mais acessível e transparente.

---

## Possíveis Extensões Futuras
- Envio de notificações por e-mail sobre eventos e confirmações.  
- Geração de relatórios de presença e estatísticas.  
- Integração com sistemas de pagamento para eventos pagos.  
- Implementação de QR Code para check-in de participantes.  
