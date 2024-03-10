it is a demo project for Spring boot crud operation using elstic search.
 my postman v10.23, elastic search v 7.17.18; I do not get error in my browser for : http://localhost:9200/; 
 ![Screenshot-browser](https://github.com/Arup-Sarkar-24/Spring-Elastic_Search-Demo/assets/121042475/26606718-300f-41be-b938-c07c0ba21ca8)
 but when I apply for get request-http://localhost:9200/ in postman ; I get badrequest-400 
  "error": {
        "root_cause": [
            {
                "type": "illegal_argument_exception",
                "reason": "request [GET /] does not support having a body"
            }
        ],
        "type": "illegal_argument_exception",
        "reason": "request [GET /] does not support having a body"
    },
    "status": 400
![Screenshot-postman-elasticsearch-error](https://github.com/Arup-Sarkar-24/Spring-Elastic_Search-Demo/assets/121042475/81b36259-6155-46b3-97f3-1e543d87e998)

If you know the reson then please tell me
