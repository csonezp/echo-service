kubectl create -f k8s.yaml
kubectl expose deployment echo-service --type="LoadBalancer"