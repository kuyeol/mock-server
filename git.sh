# 코드 수정 후
git add .
git commit -m "deploy: $(date '+%Y-%m-%d %H:%M:%S')"
git push origin master
# → GitHub Actions 자동 실행 → 서버 반영 완료