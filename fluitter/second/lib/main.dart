
import 'package:flutter/cupertino.dart';
import 'package:flutter/material.dart';
import 'package:second/cascade_grammar.dart';
import 'package:second/extends_test.dart';
import 'package:second/list_test.dart';
import 'package:second/map_test.dart';
import 'package:second/selective_parameter.dart';

void main() {

  selective_parameter_test();
  cascade_grammer_test();
  extends_test();

  List<int> listRef = list_test();
  list_add_test(listRef);
  print(listRef);
  list_rm_test(listRef);
  print(listRef);
  print("length: ${listRef.length}");

  Map mapTest = map_test();
  map_add_test(mapTest);
  map_addAll_test(mapTest);
  map_findByValue_test(mapTest);
  map_updateByKey_test(mapTest);
  
  runApp(MyApp());
}

class MyApp extends StatelessWidget {
  const MyApp({Key? key}) : super(key: key);

  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      debugShowCheckedModeBanner: false,
      home: TestPage(),
    );
  }
}

class TestPage extends StatelessWidget {
  const TestPage({Key? key}) : super(key: key);

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      body: SafeArea(
        child:
          Column(
            children: [
              Padding(
                padding: const EdgeInsets.all(25.0),
                child: Row(
                  children: [
                  Text("1조", style: TextStyle(fontWeight: FontWeight.bold),),
                  Spacer(),
                  Text("2조", style: TextStyle(fontWeight: FontWeight.bold),),
                  Spacer(),
                  Text("3조", style: TextStyle(fontWeight: FontWeight.bold),),
                  Spacer(),
                  Text("4조", style: TextStyle(fontWeight: FontWeight.bold),)
                  ],
                ),
              ),
              Expanded(
                child:
                  Image.asset("assets/pompom.png", fit: BoxFit.cover),
              ),
              const SizedBox(height: 30,),
              Expanded(
                child:
                  Image.asset("assets/img.jpg", fit: BoxFit.cover)
              ),
            ],
          ),
      )
    );
  }
}

