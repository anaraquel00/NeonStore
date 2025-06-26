# NeonStore 🛍️✨

[![License: MIT](https://img.shields.io/badge/License-MIT-yellow.svg)](https://opensource.org/licenses/MIT)
[![GitHub Stars](https://img.shields.io/github/stars/anaraquel00/NeonStore?style=social)](https://github.com/anaraquel00/NeonStore/stargazers)

Projeto de e-commerce desenvolvido com Java/Spring Framework.

<div align="center">
  <img src="https://via.placeholder.com/800x400?text=NeonStore+Screenshot" alt="Preview do Projeto">
</div>

## 🚀 Recursos Principais
- ✅ Sistema CRUD por endpoints http
- ✅ Design Strategy Pattern 

## 📦 Pré-requisitos
```bash
# Clone o repositório
git clone git@github.com:anaraquel00/NeonStore.git

# Instale as dependências
npm install  # ou yarn install
```

## 🛠️ Como Executar
```bash
npm start  # ou o comando específico do seu projeto
```

## 🌈 Estrutura do Projeto
```
src/
├── main/
│   ├── java/
│   │   └── com/
│   │       └── rqs/
│   │           └── neon_store/
|   |               ├── controller
|   |               |    └── ProdutoController.java  # Endpoints HTTP                
│   │               ├── model/
│   │               │   └── Produto.java             # Entidade JPA
│   │               ├── repository/
│   │               │   └── ProdutoRepository.java   # Interface Spring Data JPA
│   │               ├── strategy/
│   │               │   ├── CalculoFrete.java        # Interface Strategy
│   │               │   ├── FreteComum.java          # Implementação concreta 1
│   │               │   └── FreteExpresso.java       # Implementação concreta 2
│   │               ├── service/
│   │               │   └── ProdutoService.java      # Serviço que usa Strategy + Repository
│   │               └── NeonStoreApplication.java    # Classe main do Spring Boot
└── resources/
    └── application.properties                   # Configurações do BD
```

## 🤝 Como Contribuir
1. Faça um fork do projeto
2. Crie uma branch (`git checkout -b feature/nova-feature`)
3. Commit suas mudanças (`git commit -m 'Adiciona nova feature'`)
4. Push para a branch (`git push origin feature/nova-feature`)
5. Abra um Pull Request

## 📄 Licença
Este projeto está sob a licença MIT - veja o arquivo [LICENSE](LICENSE) para detalhes.

---

✨ Desenvolvido com carinho por [Ana Raquel](https://github.com/anaraquel00)