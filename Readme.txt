for webUI

http://localhost:8888/home


==== For JSON  Client
http://localhost:8888/tasks/search/findByTaskArchived?archivedfalse=0

http://localhost:8888/tasks/search/findByTaskArchived?archivedfalse=1
Type: GET

Response 
    [
        {
            "taskName": "a1",
            "taskDescription": "a1d",
            "taskPriority": "HIGH",
            "taskStatus": "ACTIVE",
            "taskId": 1
        },
        {
            "taskName": "a2",
            "taskDescription": "a2d",
            "taskPriority": "LOW",
            "taskStatus": "ACTIVE",
            "taskId": 2
        },
        {
            "taskName": "asdf",
            "taskDescription": "dsafa",
            "taskPriority": "HIGH",
            "taskStatus": "ACTIVE",
            "taskId": 3
        },
        {
            "taskName": "sfgsdf",
            "taskDescription": "gfg",
            "taskPriority": "MEDIUM",
            "taskStatus": "ACTIVE",
            "taskId": 4
        }
    ]


========

http://localhost:8888/tasks/save


POST : Request

{
        "taskName": "n1",
        "taskDescription": "n1d",
        "taskPriority": "HIGH",
        "taskStatus": "ACTIVE"
        
    }
    
    
    