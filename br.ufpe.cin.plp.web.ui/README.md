# Primeiros Passos

- Execute o script "devtools.sh" para instalar NPM, Gulp e Bower
- Em seguide, atualize as dependencias da UI:
  ```{bash}
  ~$ npm install # vai criar uma pasta node_modules com as libs de package.json
  ~$ bower install # vai criar bower_modules em src com as libs Js do projeto
  ```
- Feito isso, execute use `~$ gulp` para fazer a build do projeto. Os arquivos
compilados estarão disponíveis em `dist`.
- Use `~$ gulp serve:dist` para rodar um servidor http em dist para ver a UI
executando.
