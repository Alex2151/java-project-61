run-dist: build-dist
	./build/install/app/bin/app

build-dist: check-dist
	./gradlew installDist

check-dist:
	./gradlew checkstyleMain

git-push:
	git add .
	git commit -m "Auto commit"
	git push

