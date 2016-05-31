#!/bin/bash
# Arquivo de deployment das ferramentas de desenvolvimento da UI
curl -sL https://deb.nodesource.com/setup_5.x | sudo -E bash -
sudo apt-get install -y nodejs
sudo npm install gulp bower -g
