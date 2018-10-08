# AndroidStudy

# 1주차
  - ## 기본개념 익히기
     - Front_End, Back_End, FullStack, FrameWork 개념
     - Manifest, res, java, gradle 각각의 기능
     
  - ## Layout 다루기
     - Linearlayout, RelativeLayout, GridLayout, FrameLayout 다루기
  
  
# 2주차
 - ## Github 첫 repository 생성 시
    - GitHub 원격 repository 생성 및 생성된 주소 복사
    
    - $ cd (project-name)
        -> git bash 혹은 terminal 에서 해당 프로젝트에 들어가기
    
    - $ git init
        -> git 저장소로 지정
      
    - $ git remote add origin (복사해둔 주소)
        -> 원격 저장소를 origin으로 하고 로컬 저장소와 연결
           꼭 origin 이 아니고 본인에게 편하게 만들어도됨
    
    - $ git add *
        -> 지정해둔 git에 프로젝트의 변경사항을 모두 반영
    
    - $ git commit -m "입력할 내용"
        -> 변경사항에 대한 내용을 commit
    
    - $ git push -u origin master
        -> master branch의 내용을 원격 저장소 origin 으로 push함
       
 - ## 프로젝트 clone 시
    - 프로젝트를 저장할 디렉토리 생성 후 bash 창 실행
    
    - $ git init
        -> git 저장소로 지정
        
    - $ git clone (원격저장소 url)
        -> 원격저장소에 있는 내용을 그대로 복사
        
    - $ cd (project-name)
        
    - 작업 후 git add, commit, push 명령어 실행하여 업로드
    
 - ## Branch 다루기
    - $ git branch
        -> 프로젝트에 있는 branch list 보여주기
        
    - $ git branch -r
        -> 원격 저장소 branch list 보여주기
        
    - $ git checkout -b (branch-name)
        -> (branch-name) 브랜치 생성
        
    - $ git checkout -d (branch-name)
        -> (branch-name) 브랜치 삭제
        
    - $ git checkout (branch-name)
        -> (branch-name) 브랜치로 전환
        
    - $ git merge (branch-name)
        -> (branch-name)을 master branch에 합침
        
    - 작업 후 git add, commit, push 명령어 실행하여 업로드
   
 - ## 기타 명령어
    - $ git status
        -> git의 변경사항(추가된 내용, 삭제된 내용 등)을 확인
        
    - $ git pull origin master
        -> origin 이라는 원격저장소로부터 내용을 불러와 로컬에서 작업중인 프로젝트와 merge함
        
  
 - ## View 다루기
    - ImageView, TextView, EditText, Button, Listview, RecyclerView, GridView
    
    
    
