#!/usr/bin/env node

var firmata = require('./lib/firmata.js'),
    repl = require('repl');
console.log('Enter USB Port and press enter:');
process.stdin.resume();
process.stdin.setEncoding('utf8');
process.stdin.once('data', function(chunk) {
    var port = chunk.replace('\n', '');
    var board = new firmata.Board(port, function() {
        console.log('Successfully Connected to ' + port);
        repl.start('firmata>').context.board = board;
    });
});
// What is it